var exec = require('cordova/exec');

var PLUGIN_NAME = 'MovistarApp';

exports.showExternalBrowser = function (url) {
    return new Promise(function(resolve, reject) {
        exec(resolve, reject, PLUGIN_NAME, "showExternalBrowser", [url]);
    });;
};

