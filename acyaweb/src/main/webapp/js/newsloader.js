app.controller('newsCtrl', function($scope, $http) {
    
	var pgsize=5;
    var start=0;
	loadNews();
	
	 
function loadNews(){
		showloader();
		hideloadMore();
		$http.get(serviceUrl+"NewsServlet?pgsize="+pgsize+"&start="+start)
		  .success(function (response) {
			   	if(response!=null)
			  	{
			   		//alert(JSON.stringify(response));
			   		for(news in response.responseData.results)
			  		{
			  			
			  			var index=start+Number(news);
			  			
			  			var topNewsHtml='<div class="row well pointer" id="'+index+'">'
			  			+'<div class="col-sm-4">'
			  			+'<img /src="'+response.responseData.results[news].image.url+'" style="width:100%;">'
			  			+'</div>'
			  			+'<div class="col-sm-8 ">'
			  				+'<div class="row">'
			  					+'<div class="col-sm-12">'
			  						+'<b>'+response.responseData.results[news].title+'</b>'
			  					+'</div>'
			  				+'</div>'
			  				+'<div class="row">'
		  					+'<div class="col-sm-12 pd">'
		  						+'<p>'+response.responseData.results[news].content
		  					+'</div>'
		  				+'</div>'
			  			+'</div></div>';
			  			
			  			var resHtml=
						  	'<div class="row well pointer" id="tp'+index+'">'
			  			+'<div class="col-sm-12">'
			  					+'<p>'+response.responseData.results[news].title
		  					+'</div>'
		  				+'</div>'
		  				
		  				$("#newslist").html($("#newslist").html()+topNewsHtml);
				  		$("#topNews").html($("#topNews").html()+resHtml);
				  		
			  		}
			   		
			   		for(news in response.responseData.results)
			  		{
			  			
			  			var index=start+Number(news);
			  			$('#'+index).click(function(){
			  				alert(this.id);
			  				document.location.href=response.responseData.results[this.id].unescapedUrl;
				  		});
			  			
			  			$('#tp'+index).click(function(){
			  				selectedRID=removeSpecialChar(response.responseData.results[this.id].title);
			  				document.location.href="chat/index.html?romm="+selectedRID;	
			  			});
			  		}	
			   		
			   		
			  		hideloader();
			  		$('#hdr').html(''+(start+pgsize)+' of '+response.responseData.cursor.estimatedResultCount);
			  		
			  		
			  		
			  		
			  		
			  		if(response.responseData.cursor.estimatedResultCount > response.responseData.cursor.currentPageIndex+response.responseData.results.length)
			  		{
			  			showloadMore();
			  			start=start+pgsize;
						 
			  		}
			  		
			  		
			  	}
			  });
		
		$('#ldmre').click(function(){
			loadNews();
		});
		
		function showloadMore(){
			$("#ldmre").removeClass('gone');
	  		
		}
		
		function showloader(){
			$("#ldr").removeClass('gone');
		}
		
		function hideloader(){
			$("#ldr").addClass('gone');
			
		}
		
		function hideloadMore(){
			$("#ldmre").addClass('gone');
			
		}
		
	}
	
	
});



