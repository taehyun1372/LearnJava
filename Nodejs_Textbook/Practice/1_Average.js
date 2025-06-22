average = function(array)
{
    if (array.length > 0)
    {
        var sum = 0;
        var count = 0;
        for(i = 0; i < array.length; i++)
        {
            count++;
            sum += array[i];
        }
        return sum/count;
    }
    else
    {
        return 0;
    }
}

array1 = [1, 2, 3, 4, 5];
array2 = [-1];
array3 = [0];
console.log(average(array3));