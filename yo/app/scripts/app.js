'use strict';

/**
 * @ngdoc overview
 * @name yeomanGradlePluginExampleApp
 * @description
 * # yeomanGradlePluginExampleApp
 *
 * Main module of the application.
 */
angular
  .module('yeomanGradlePluginExampleApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
