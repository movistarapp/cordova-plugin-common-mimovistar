
#import "MovistarApp.h"

@implementation MovistarApp

- (void)pluginInitialize {
    NSLog(@"Starting MovistarApp plugin");
}

- (void)showExternalBrowser:(CDVInvokedUrlCommand*)command
{
    CDVPluginResult* pluginResult = nil;
    NSString* echo = [command.arguments objectAtIndex:0];

    if (echo != nil && [echo length] > 0) {
        [[UIApplication sharedApplication] openURL:[NSURL URLWithString:echo] options:@{} completionHandler:nil];
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:echo];
    } else {
        pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR];
    }

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
