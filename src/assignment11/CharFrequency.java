package assignment11;


import java.io.*;
import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        try {
            File f=new File("example.txt");
            FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            int c = 0;
            while((c = br.read()) != -1)
            {
                char character = (char) c;
                if(character != 32){
                    if(map.containsKey(character)){
                        int val = map.get(character)+1;
                        map.put(character, val);
                    }else {
                        map.put(character,1);
                    }
                }
            }

            FileOutputStream ops = new FileOutputStream("result.txt");
            ObjectOutputStream objOps = new ObjectOutputStream(ops);
            objOps.writeObject(map.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(map);
    }
}