package main.pipe_and_filter;

import java.util.Scanner;

public  class FilterA extends Filter {
 
    public FilterA(Pipe _dataINPipe, Pipe _dataOUTPipe) {
		super();
		this._dataINPipe = _dataINPipe;
		this._dataOUTPipe = _dataOUTPipe;
	}

	Pipe _dataINPipe;
    Pipe _dataOUTPipe;
     
    public String getData(){
        return _dataINPipe.dataOUT();
    }
     
    public void sendData( String tempData){
        _dataOUTPipe.dataIN(tempData);
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		execute();
	}

	@Override
	synchronized void execute() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string");

		String s=sc.next();

		
		_dataOUTPipe.dataIN(s);
		_dataOUTPipe.dataIN("azerty2");
		_dataOUTPipe.dataIN("azerty3");
		_dataOUTPipe.dataIN("azerty4");
	}
}
 