package com.external.browser;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
import android.content.Intent;
import android.net.Uri;
/**
 * This class echoes a string called from JavaScript.
 */
public class ExternalBrowser extends CordovaPlugin {


    @Override
    protected void pluginInitialize() {
        Log.d("ExternalBrowser", "Starting ExternalBrowser plugin");
    }
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         if(action.equals("showExternalBrowser")){
            this.showExternalBrowser(args.getString(0), callbackContext);
        }
        return false;
    }

    private void showExternalBrowser(String url,CallbackContext callbackContext){
        if( url != null && url.length() > 0){
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            cordova.getActivity().startActivity(i);
            callbackContext.success(url);
        }else{
            callbackContext.error("empty url");
        }
      }
}
