import java.io.*;
import java.util.*;

public class Sorts {

    public static ArrayList<String> merge(ArrayList<String> a,ArrayList<String> b) {
        ArrayList<String> res = new ArrayList<String>(a.size() + b.size());
        int ia=0,ib=0;
        while (ia < a.size() || ib < b.size()) {
            if (ia < a.size() && (ib >= b.size() || a.get(ia).compareTo(b.get(ib))<0)) {
                res.add(a.get(ia));
                ia++;
            } else {
                res.add(b.get(ib));
                ib++;
            }
        }
        return res;
    }

    public static void msort(ArrayList<String> a) {
        if(a.size()<2) return;

        ArrayList<String> b = new ArrayList<String>(a.size()/2);
        ArrayList<String> c = new ArrayList<String>(a.size()-b.size());

        copy(a,b,0,a.size()/2);
        copy(a,c,a.size()/2,a.size()-b.size());

        msort(b);
        msort(c);

        ArrayList<String> swag = merge(b,c);
        copy(swag,a,0,swag.size());

        System.out.println("Merged: " + swag.toString());

    }

    public static void copy(ArrayList<String> a,ArrayList<String> b,int count,int size) {
        boolean empty = false;
        if(b.isEmpty()) {
            empty = true;
        }
        for(int i=count;i<(size+count);i++) {
            if(empty) {
                b.add(a.get(i));
            } else {
                b.set(i-count,a.get(i));
            }
	}
    }
    
    public static String name() {
        return "Oh, Albert";
    }

}
