
<html>
    <body style="margin-left: 554px; margin-top: 100px;">
        <div >
            <form action="avgPercentage" method="POST">
                <h2>choose Semester:</h2>
            <input type="radio" name="Sem" value="Semester 1"/>Semester 1
            <input type="radio" name="Sem" value="Semester 2"/>Semester 2<br/>
            <input type="submit"/>
            </form>
             </div>
        <div name="Marks">
           <h2>Avg Percentage of class for recent semester</h2>
           <h4>AvgPercentage:${avgPercentage}%</h4>
           <h2> Average marks of Students in a subject</h2>
           <h4>English,Maths,Science=${Marks}</h4>
        </div>
        <div>
            <h2>Top 2 Consistent Students are:${top2ConsistentStudents}</h2>

        </div>
    </body>
</html>