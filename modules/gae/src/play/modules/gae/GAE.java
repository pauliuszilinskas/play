package play.modules.gae;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.urlfetch.URLFetchService;
import com.google.appengine.api.urlfetch.URLFetchServiceFactory;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class GAE {
    
    public static DatastoreService getDatastore() {
        return DatastoreServiceFactory.getDatastoreService();
    }

    public static UserService getUserService() {
        return UserServiceFactory.getUserService();
    }

    public static URLFetchService getURLFetchService() {
        return URLFetchServiceFactory.getURLFetchService();
    }

}
