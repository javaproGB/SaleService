(function () {
    angular
        .module('sale-service', ['ngRoute', 'ngStorage'])
        .config(config)
        .run(run);

    function config($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'welcome/welcome.html',
                controller: 'welcomeController'
            })
            .when('/auth', {
                templateUrl: 'auth/login.html',
                controller: 'authController'
            })
            .when('/adverts', {
                            templateUrl: 'adverts/adverts.html',
                            controller: 'advertsController'
            })
            .otherwise({
                redirectTo: '/'
            });
    }

    function run($rootScope, $http, $localStorage) {
                if ($localStorage.marketWebUser) {
                    try {
                        let jwt = $localStorage.marketWebUser.token;
                        let payload = JSON.parse(atob(jwt.split('.')[1]));
                        let currentTime = parseInt(new Date().getTime() / 1000);
                        if (currentTime > payload.exp) {
                            console.log("Token is expired!");
                            $scope.clearUser;
                        }
                    } catch (e) {
                    }

                    $http.defaults.headers.common.Authorization = 'Bearer ' + $localStorage.marketWebUser.token;

                }
                if (!$localStorage.marketWebUserGuestId) {
                 //TODO генерация токена
                   }
    }
})();

angular.module('sale-service').controller('indexController', function ($rootScope, $scope, $http, $location, $localStorage) {

});