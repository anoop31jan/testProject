import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ArrayTest {


    public static void main(String[] args) throws Exception {


        ExecutorService service = Executors.newFixedThreadPool(3);


        Future<List<Integer>> submit = service.submit(() ->
                {
                 System.out.println("Inside callable 1"+Thread.currentThread().getName())   ;

               return  Arrays.asList(7,8,9,10);}
                );



        Future<List<Integer>> submit2 = service.submit(() ->
                {
                    System.out.println("Inside callable 2 "+Thread.currentThread().getName())   ;
                    return  Arrays.asList(1, 2, 3, 4, 5, 6) ;}
        );





        System.out.println(submit.get());
        System.out.println(submit2.get());

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> System.out.println(" RunAsync called"));


        System.out.println(" main Thread ended");


       CompletableFuture<List<String>> completableFuture = CompletableFuture.supplyAsync(() -> Arrays.asList("Anoop","Om","Pandey"), service);


        System.out.println(completableFuture.get());

        service.shutdown();

    }


}
