angular.module('sale-service').controller('authController', function ($scope, $http, $localStorage) {
    const contextPath = '';

    $scope.tryToAuth = function () {
         $http.post(contextPath, $scope.user)
             .then(function successCallback(response) {
                 if (response.data.token) {
                     $http.defaults.headers.common.Authorization = 'Bearer ' + response.data.token;
                     $localStorage.webUser = {username: $scope.user.username, token: response.data.token};

                     $scope.user.username = null;
                     $scope.user.password = null;
                     $scope.mergeCart();
                     $location.path('/');
                 }
             }, function errorCallback(response) {
             });
     };
});