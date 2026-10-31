<h2><a href="https://www.geeksforgeeks.org/problems/design-browser-history/1">Design Browser History</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">You are given <strong>q</strong> operations to be performed on a browser with a single tab. Implement the BrowserHistory class to process these operations.</span></p>
<p><span style="font-size: 14pt;">The operations are provided as a 2D string array <strong>operations[][]</strong> of size <strong>q × 2</strong>, where:</span></p>
<ul>
<li><span style="font-size: 14pt;">operations[i][0] denotes the operation.</span></li>
<li><span style="font-size: 14pt;">operations[i][1] denotes the corresponding argument.</span></li>
</ul>
<p><span style="font-size: 14pt;">The first operation is always: ["BrowserHistory", homepage] -&gt;&nbsp; Initializes the browser with the given homepage.</span></p>
<p><span style="font-size: 14pt;">The remaining operations are:</span></p>
<ul>
<li><span style="font-size: 14pt;">["visit", url] -&gt; Visits the webpage url from the current page and clears all the forward history.</span></li>
<li><span style="font-size: 14pt;">["back", steps] -&gt; Moves backward by at most steps pages and returns the current URL.</span></li>
<li><span style="font-size: 14pt;">["forward", steps] -&gt; Moves forward by at most steps pages and returns the current URL.</span></li>
</ul>
<p><span style="font-size: 14pt;">If the requested number of backward or forward steps exceeds the available history, move as far as possible and return the URL of the page where the browser stops.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">q = 6 operations[][] = [ ["BrowserHistory", "gfg.org"], ["visit", "google.com"], ["visit", "facebook.com"], ["back", "2"], ["forward", "1"], ["visit", "linkedin.com"] ]
</span><strong><span style="font-size: 18px;">Output:</span> </strong></span><span style="font-size: 18px;"><span style="font-size: 18px;">[gfg.org, google.com]
</span><strong style="font-size: 18px;">Explanation: <br></strong><span style="font-size: 18px;">Initialize the browser with "gfg.org".
Visit "google.com" and then "youtube.com".
back(1) moves to "google.com".
forward(1) moves back to "youtube.com".</span></span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">q = 3, operations[][] = [["BrowserHistory", "google.com"], ["visit", "youtube.com"], ["back", "2"]]
</span><strong style="font-size: 18px;">Output: </strong><span style="font-size: 18px;">["google.com"]
</span><strong style="font-size: 18px;">Explanation: <br></strong><span style="font-size: 18px;">Initialize the browser with "google.com".
Visit "youtube.com".
back(2) requests moving back two pages, but only one previous page is available.
The browser moves back one step and returns "google.com".</span></span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong></span><span style="font-size: 18px;"><span style="font-size: 18px;">1 ≤ q ≤ 5000<br></span></span><span style="font-size: 14pt;">1 ≤ homepage.length ≤ 20<br></span><span style="font-size: 14pt;">1 ≤ url.length ≤ 20<br></span><span style="font-size: 14pt;">1 ≤ steps ≤ 100<br></span><span style="font-size: 14pt;">homepage and url consist of . and lowercase English letters only.<br></span><span style="font-size: 14pt;">At most 5000 calls will be made to visit, back, and forward.</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;<code>Design-Pattern</code>&nbsp;