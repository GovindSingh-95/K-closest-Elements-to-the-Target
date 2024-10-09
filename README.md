# K-closest-Elements-to-the-Target
<h2>Question Statement</h2>
<p>
<br>Given a sorted Array, with a target and K, need to find K closest Elements to the target.<br>
<br> a is considered to be closest to X than b, only if=>
<br>|x-a|<|x-b| and  b>a if |x-a|==|x-b|.<br>
</p>
<h2>Algorithm</h2>
<p>
<br>1) The Target Element may or may not be present in the Array.<br>
<br>2) Thus we'll use the LowerBound concept to find the minimum possible indexof the Target.As, lowerbounds tells the index just greater or equal to target (arr[idx]>=target).<br>
<br>3) Store this index in a varible say j, then create a variable i=j-1.<br>
<br>4) The purpose of i to travel backwards and j in forward direction.So either of the one reaches out of index (i>=0 && n>j). We have to compare which index is closer by verifying the conditions given in the question.<br>
<br>5) After adding the element in ArrayList, push that respective index to it's boundary.<br>
<br>6) We also have to keep an eye on value of K (It's the number of closest elements we need to find wrt target).If k<0 then, break the loop. Thus the main conditiion is while(i>=0 && n>j && k>=0) and after adding each elements in the List, decrease k by 1.<br>
<br>7) If k is still greater than 0 and the main loop gets broken. Then just create 2 more while loops one with condion while(i>=0 && k>=0) to fill the remaining elements in list while j gets exhausted.<br>
<br>8) The other condition is while(n>j && k>=0)to fill the remaining elements in list while i gets exhausted.<br>
<br>9) Before submitting list just sort it.<br>
</p>
<h3>Code is in source file</h3>

