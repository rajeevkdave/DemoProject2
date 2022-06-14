package com.technosoft.demo;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice2 {

    public Map<String, Long> aboveBelow(final List<Integer> inputList, final int value){
        return
                inputList.stream().collect(Collectors.groupingBy(x -> x > value ? "above" : "below", Collectors.counting()));
    }

    public String stringRotation(final String origString, final int rotationAmount) {
        var substring1 = origString.substring(0, origString.length() - rotationAmount);
        var substring2 = origString.substring(origString.length() - rotationAmount);
        return substring2 + substring1;
    }
}
