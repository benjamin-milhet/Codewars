unit Kata;

interface

function DigitalRoot (n: Integer): Integer;

implementation

function DigitalRoot (n: Integer): Integer;
var m, Res: Integer;
begin
   Res := 0;
  while n > 0 do
  begin 
     m := n mod 10;
     Res:=Res + m;
     n := Trunc((n-m)/10);
  end;
  if Res > 9 then Res:= DigitalRoot(Res);
  
  Result:=Res;

end;

end.