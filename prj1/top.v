// Generator : SpinalHDL v1.6.1    git head : 113717dc927210941465a558a9c753d853dd16a3
// Component : top



module top (
);

  wire       [7:0]    a;
  wire       [7:0]    d;
  wire                e;
  wire       [5:0]    b;
  wire       [14:0]   c;

  assign b = (a[7 : 2] + {5'd0, ((! (&a[7 : 2])) && a[1])});
  assign c = {a,(~ b),(! e)};

endmodule
