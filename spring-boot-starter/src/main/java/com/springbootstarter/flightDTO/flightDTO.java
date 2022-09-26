package com.springbootstarter.flightDTO;

public class flightDTO {
	private int flight_id;
	private int airline_id;
	private String airline_name;
	private String airline_from;
	private String airline_to;
	private String dept_time;
	private String arr_time;
	private String dur;
	private int total_seat;
	
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public int getAirline_id() {
		return airline_id;
	}
	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getAirline_from() {
		return airline_from;
	}
	public void setAirline_from(String airline_from) {
		this.airline_from = airline_from;
	}
	public String getAirline_to() {
		return airline_to;
	}
	public void setAirline_to(String airline_to) {
		this.airline_to = airline_to;
	}
	public String getDept_time() {
		return dept_time;
	}
	public void setDept_time(String dept_time) {
		this.dept_time = dept_time;
	}
	public String getArr_time() {
		return arr_time;
	}
	public void setArr_time(String arr_time) {
		this.arr_time = arr_time;
	}
	public String getDur() {
		return dur;
	}
	public void setDur(String dur) {
		this.dur = dur;
	}
	public int getTotal_seat() {
		return total_seat;
	}
	public void setTotal_seat(int total_seat) {
		this.total_seat = total_seat;
	}

	@Override
	public String toString() {
		return "flightDTO [flight_id=" + flight_id + ", airline_id=" + airline_id + ", airline_name=" + airline_name
				+ ", airline_from=" + airline_from + ", airline_to=" + airline_to + ", dept_time=" + dept_time
				+ ", arr_time=" + arr_time + ", dur=" + dur + ", total_seat=" + total_seat + "]";
	}
	
}
