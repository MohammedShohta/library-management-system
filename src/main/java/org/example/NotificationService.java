package org.example;

import java.security.spec.ECField;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NotificationService {
    private final ExecutorService notification;

   public NotificationService()
   {
       this.notification= Executors.newFixedThreadPool(2);
   }

   public void sendNotifcation(String messageNotification)  {
           notification.submit(()->{
               System.out.println(Thread.currentThread().getName()+" "+messageNotification);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           });
   }
   public void shutdown()
   {
       notification.shutdown();
   }

}
