
public static String remove(String str) {
    return str.substring(1, str.length() -1);
}

public static Object[] removeEveryOther(Object[] arr) {
    int count = 0;
    Object[] result = new Object[(arr.length + 1)/2];
    for (var item : arr)
    {
        if (count % 2 == 0)
        {
            result[count/2] = item;
        }
        count++;
    }
    return result;
}

static String removeExclamationMarks(String s) {
    while(s.contains("!"))
    {
        s = s.substring(0, s.indexOf("!"))+ s.substring(s.indexOf("!") + 1);
    }
    return s;
}

public static void displayArray(Object[] arr){
    for(var item : arr)
    {
        System.out.println(item);
    }
}

void main() {
    System.out.println("Hello World");
    System.out.println(remove("eloquent"));
    var result1 = removeEveryOther(new Object[] { "Hello", "Goodbye", "Hello Again" });
    var result2 = removeEveryOther(new Object[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    displayArray(result1);
    displayArray(result2);
    System.out.println(removeExclamationMarks("!Hello! World!"));

}

