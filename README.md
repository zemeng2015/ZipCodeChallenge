# ZipCodeChallenge
The idea to solve this problem is to sort the zipcode range by their start points. Then, we take the first zipcode range pair and compare its end zipcode with the next zipcode range starts. When they have overlap range, we update the end to be the max end zipcode. Once we find a non overlapping zipcode range, we can add the previous range to the result set and start over.

Sorting takes O(n log(n)) and merging takes O(n). So, time complexity is O(n log(n)).
