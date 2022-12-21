<html>
    <body style="margin-left: 554px; margin-top: 100px;">
        <h2>Add Marks to Register Students</h2>
        <form action="add" modelAttribute="addMarks" method="POST">
        <table>
            <tr>
                <th>RollNo:</th>
                <td><input type="number" name="rollNo"/></td>
            </tr>
            <tr>
                <th>
                    Marks:
                </th>
                <td>
                    <input type="radio" name="semester" value="Semester 1"/>Semester 1
                    <input type="radio" name="semester" value="Semester 2"/>Semester 2
                </td>
             </tr>
             <tr>
                <th>
                    Subjects:
                </th>
                <td></td>  
             </tr>
             <tr>
                <th>
                    English:
                    
                </th>
                <td>
                    <input type="number" name="english" />
                </td>
             </tr>
             <tr>
                <th>
                    Maths:
                    
                </th>
                <td>
                    <input type="number" name="maths" />
                </td>
             </tr>
             <tr>
                <th>
                    Science:
                    
                </th>
                <td>
                    <input type="number" name="science"/>
                </td>
             </tr>
             <tr>
                <td></td>
                <td><input type="submit"/></td>
             </tr>
        </table>
        </form>
    </body>
</html>