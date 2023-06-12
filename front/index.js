(function () {
    angular
        .module('sale-service', ['ngRoute', 'ngStorage'])
        .config(config)
        .run(run);

    function config($routeProvider) {
        $routeProvider
            .when('/auth', {
                templateUrl: 'auth/login.html',
                controller: 'authController'
            })
            .otherwise({
                redirectTo: '/'
            });
    }

    function run($rootScope, $http, $localStorage) {

    }
})();

angular.module('sale-service').controller('indexController', function ($rootScope, $scope, $http, $location, $localStorage) {

});