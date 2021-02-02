class QuickStart {
    public static void main(String[] args) {
        
        /* System.out.println("Hello, World.");
        System.out.println(Thread.currentThread().getThreadGroup().getName()); //main
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //system */
        Thread t = new Thread(new Runnable(){
           @Override
           public void run(){
               System.out.println(".......... Implementing runnable interface.");
           } 
        });
        t.start();
    }
}
