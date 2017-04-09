package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by SHANTI on 24-08-2015.
 */
public class StockSpan {
    public static void main(String[] args){
        List<Integer> stockPriceList = new ArrayList<Integer>();
        stockPriceList.add(100);
        stockPriceList.add(60);
        stockPriceList.add(70);
        stockPriceList.add(65);
        stockPriceList.add(80);
        stockPriceList.add(85);

        List<Integer> stockSpanList = getStockSpan(stockPriceList);
        System.out.println(stockSpanList);

    }
    static List<Integer> getStockSpan(List<Integer> stockPriceList){
        List<Integer> stockSpanList = new ArrayList<Integer>();

        stockSpanList.add(0,1);
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);

        for(int i=1; i<stockPriceList.size(); i++){

            while(!s.isEmpty() && stockPriceList.get(s.peek())< stockPriceList.get(i)){
                s.pop();
            }
            stockSpanList.add(i-s.peek());

            s.push(i);
        }
        return stockSpanList;
    }
}
