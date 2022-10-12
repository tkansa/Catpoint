module security {

    exports com.udacity.catpoint.security.data;
    exports com.udacity.catpoint.security.service;
    exports com.udacity.catpoint.security.application;
    requires com.udacity.catpoint.image;
    requires java.desktop;
    requires miglayout;
    requires java.prefs;
    requires com.google.gson;
    requires com.google.common;
    opens com.udacity.catpoint.security.data to com.google.gson;
}