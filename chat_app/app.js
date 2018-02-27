var ChatModule=angular.module('ChatModule',['ngRoute']);


ChatModule.controller('ChatController',['$http',function($http){

var chatCtrl=this;
chatCtrl.mesg={};


var sockjs=new SockJS("http://localhost:8080/backend/chat");

var client=Stomp.over(sockjs);



client.connect({},function(){
    console.log("connected");
    client.subscribe('/topic/message', function(notification) {
        // Call the notify function when receive a notification
        //console.log(notification);
      });
      //client.send("/app/chat/",{},"helllo");
})














chatCtrl.sendMessage=function()
{
    alert("helllo");
   chatCtrl.mesg.id=4;

   console.log(chatCtrl.mesg);
    client.send("/app/chat/",{},
    {
        "message":"hello",
        "id":"8"
    });
    

    // sockjs.send("hello");
}










    
}])



ChatModule.config(function($routeProvider){

    $routeProvider
    .when("/",{
        templateUrl:'./app/chatbox.html',
        controller:'ChatController',
        controllerAs:'chatCtrl'
    })

})