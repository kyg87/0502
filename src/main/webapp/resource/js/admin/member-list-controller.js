var memberListModule = angular.module("member-list",[]);

memberListModule.controller("member-list-controller",function($scope,$http){

    // var memberList = [
    //     {"id":"newlec","name":"뉴렉","checked":true},
    //     {"id":"dragon","name":"손오공","checked":false},
    //     {"id":"newlec1","name":"뉴렉1","checked":true}
    // ];
	 var memberList = [];
	  
     $http({
        method:"GET",
        url:"/MavenPrj/admin/get-member-list"
        	
     }).then(function(response){
        
        
         $scope.list = response.data;
     });
 
   
     $scope.allCheck = false;
    $scope.list = memberList;
 
    $scope.delButtonClick = function(){
         
         alert("aa");

/*        angular.forEach($scope.list, function(value, key){
            if(value.checked)
            memberList.splice(0,1);
        });*/
        
        var size = $scope.list.length;
        
        for(var i = 0; i < size ;i++){
        	if($scope.list[size-1-i].checked)
        		$scope.list.splice(size-1-i,1);
        }
        

    }

  

    $scope.allCheckButtonClick = function(){
  

        angular.forEach($scope.list, function(value, key){
            
            value.checked = $scope.allCheck;

        });

    }

    $scope.searchButtonClick = function(){
        alert($scope.queryText);
     $http({
        method:"GET",
        url:"/MavenPrj/admin/get-member-list?id=" + $scope.queryText
        	
     }).then(function(response){
        
        console.log(response);
         $scope.list = response.data;
     });
    }
    

 

});