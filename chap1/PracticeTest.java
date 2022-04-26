import java.util.*;
class PracticeTest {

    public static  void main(String[] args) {
    // Set set = new HashSet(Arrays.asList( 0, +0, -0L, +0L, -0F, 0F, -0D, 0D, 0xF, 0xD, 0x0.DP+0));
    Set set = new HashSet(Arrays.asList( 0, +0, -0L, +0L, -0F, 0F, -0D, 0D));
    System.out.println(set.size());
    }
}