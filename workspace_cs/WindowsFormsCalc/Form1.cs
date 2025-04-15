using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsCalc
{
    public partial class Form1 : Form
    {
        double before = 0; // 처음에 입력된 순자
        double after = 0;
        double result = 0;

        String op = null;

        List<double> numList = new List<double>();
        List<double> opList = new List<double>();

        public Form1()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            
        }

        private void button14_Click(object sender, EventArgs e)
        {

        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            // 지금까지 적은 숫자를 저장
            this.before = double.Parse(display.Text);
            // 연산자 저장
            this.op = "-";
        }

        bool hasDot = false;
        private void button1_Click_1(object sender, EventArgs e)
        {
            if (!hasDot)
            {
            display.Text += '.';
            hasDot = true;
            }
            if(display.Text.IndexOf(".") == -1)
            {
                display.Text += '.';
            }
        
        }

        private void button5_Click(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            display.Text = " ";
            this.before = 0 ;
            this.after = 0 ;
            this.result = 0 ;

        }

        private void button14_Click_1(object sender, EventArgs e)
        {
            display.Text += '1';
            double num = double.Parse(display.Text);
            display.Text = ""+num;
        }

        private void label1_Click_1(object sender, EventArgs e)
        {
            
        }

        private void button15_Click(object sender, EventArgs e)
        {
            display.Text += '2';
            double num = double.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button16_Click(object sender, EventArgs e)
        {
            display.Text += '3';
            double num = double.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button10_Click(object sender, EventArgs e)
        {
            display.Text += '4';
            double num = double.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button11_Click(object sender, EventArgs e)
        {
            display.Text += '5';
            double num = double.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button18_Click(object sender, EventArgs e)
        {
            display.Text += '0';
            double num = double.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            display.Text += '7';
            double num = double.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            display.Text += '8';
            double num = double.Parse(display.Text);
            display.Text = "" + num;
        }

        private void button8_Click(object sender, EventArgs e)
        {
            display.Text += '9';
            double num = double.Parse(display.Text);
            display.Text = "" + num;
        }

    

        private void button17_Click(object sender, EventArgs e)
        {
            // 지금까지 적은 숫자를 저장
            this.before = double.Parse(display.Text);
            // 연산자 저장
            this.op = "+";
           display.Text = "0";
        }

        private void button13_Click(object sender, EventArgs e)
        {
            // 지금까지 적은 숫자를 저장
            this.before =  double.Parse(display.Text);
            // 연산자 저장
            this.op = "*";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            // 지금까지 적은 숫자를 저장
            this.before = double.Parse(display.Text);
            // 연산자 저장
            this.op = "/";
            //List<int> c = new List<int>();
        }

        private void button20_Click(object sender, EventArgs e)
        {
            this.after =  double.Parse(display.Text);
            
            
            if ("+".Equals(op))
            {
                this.result = this.before + this.after;
             
            }
            else if ("-".Equals(op)){
                this.result = this.before - this.after;
                
            }
            else if ("*".Equals(op))
            {
                this.result = this.before * this.after;
            }
            else if ("/".Equals(op))
            {
                this.result = this.before / this.after;
            }
            display.Text = "" + this.result;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
