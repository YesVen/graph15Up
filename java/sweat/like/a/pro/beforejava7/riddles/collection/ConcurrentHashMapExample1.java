package sweat.like.a.pro.beforejava7.riddles.collection;
/*
 * This is advanced version of hashmap.
 * 
 * Instead of having lock on entire table(like in hashtable), it creates segments internally.
 * So the map is broken down into parts called segments each having its own lock.
 * 
 * Every updated operation has to get lock and then proceed. 
 * By default 16 segments are created so a dingle instance of CHM can server 16 threads at a time.
 * 
 * For read operation no lock is required.
 * 
 */
public class ConcurrentHashMapExample1 {

}
