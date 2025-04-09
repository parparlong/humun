using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Oracle.ManagedDataAccess.Client;

namespace WindowsFormsDB
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

        }

        private void lable_Click(object sender, EventArgs e)
        {
            //MessageBox.Show("크왕!!!!");//알람
           
            // DB접속정보
            string connectionString = "" +
                "Data Source=" +
                "(" +
                " DESCRIPTION=" +
                " (" +
                " ADDRESS=" +
                " (PROTOCOL=TCP)" +
                " (HOST=125.181.132.133)" +
                " (PORT=51521)" +
                " )" +
                " (" +
                " CONNECT_DATA=" +
                " (" +
                " SERVICE_NAME=xe" +
                " )" +
                " )" +
                ");" +
                "User Id=scott3_9;" +
                "Password=tiger;";

            //자바에 try-with-resoulce 같음 ussing을 사용하면 close를 자동으로해줌
            using (OracleConnection connection = new OracleConnection(connectionString))
            {
                try
                {
                    connection.Open();

                    string query = "SELECT * FROM EMP";
                    //string query = "SELECT * FROM EMP WHERE EMPNO = :empno";
                    OracleCommand command = new OracleCommand(query, connection);

                    OracleDataAdapter adapter = new OracleDataAdapter(command);
                    DataTable dataTable = new DataTable();
                    adapter.Fill(dataTable);

                    dataGridView1.DataSource = dataTable;
                }
                catch (Exception ex)
                {
                    MessageBox.Show("오류 발생: " + ex.Message);
                }
            }

        }
    }
}
