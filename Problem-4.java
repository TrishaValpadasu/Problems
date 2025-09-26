import java.util.*;

public class Problem-4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers");
        String input=sc.nextLine();
        input=input.replace("[","").replace("]","");
        String[] arr1=input.split(",");
        int[] arr2= new int[arr1.length];
        for (int i=0;i<arr1.length;i++) {
            arr2[i] =Integer.parseInt(arr1[i].trim());
        }
        Map<Integer,Integer>map=getMultiplesCount(arr2);
        System.out.println(formatMap(map));
    }
    static Map<Integer,Integer> getMultiplesCount(int[]arr2){
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=1; i<=9;i++) map.put(i,0);
        for(int num:arr2){
            for(int i= 1;i<=9;i++) {
                if(num%i==0)map.put(i,map.get(i)+1);
            }
        }
        return map;
    }
    static String formatMap(Map<Integer,Integer> map){
        StringBuilder sb=new StringBuilder("{");
        for(var entry:map.entrySet()){
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
        }
        sb.setLength(sb.length()-2);
        sb.append("}");
        return sb.toString();
    }
}
