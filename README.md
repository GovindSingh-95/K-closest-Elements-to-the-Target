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
<br>2) Thus we'll use the LowerBound concept to find the minimum possible indexof the Target.As, lowerbounds tells the index just greater or equal to target (arr[idx]>=target) <br>
<br>3) store this index in <br>
</p>
