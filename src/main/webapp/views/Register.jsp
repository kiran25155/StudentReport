<html>
    <body>
        <div style="margin-left: 554px; margin-top: 100px;">
            <form action="RegisterStudent" method="POST"  modelAttribute="Student"> 
              <table style="text-align: center">
                 <tr>
                    <th>
                        Roll No:
                    </th>
                    <td>
                        <input type="number" name="rollNo"/>
                    </td>
                 </tr>
                 <tr>
                    <th>
                        Name:
                    </th>
                    <th>
                        <input type="text" name="name"/>
                    </th>
                 </tr>
                 <tr>
                    <td></td>
                    <td><input type="submit"/></td>
                 </tr>
              </table>
            </form>
        </div>
    </body>
</html>