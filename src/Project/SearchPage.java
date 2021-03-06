package Project;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;


public class SearchPage extends JPanel {
	
	private JLabel pageName = new JLabel ("Search Page");
	
	
	public  SearchPage(){
		
		//spilt the screen into Project.SearchPage.SearchPage().splitInHalves
		JPanel splitInHalves = new JPanel();              
		splitInHalves.setLayout(new GridLayout(1, 2));
		
		// beginning of the code that makes left half the panel
		JPanel leftHalf = new JPanel();
		leftHalf.setLayout(new BorderLayout());
		
		// beginning of the code that makes the search bar
		JTextField searchBox = new JTextField();
		searchBox.setColumns(16);
		JLabel searchBoxLabel = new JLabel ("Stock Search");
		JButton searchButton = new JButton("Search");

		JPanel searchComponentsCombine = new JPanel();
		searchComponentsCombine.setLayout(new FlowLayout());
		searchComponentsCombine.add( searchBoxLabel);
		searchComponentsCombine.add( searchBox);
		searchComponentsCombine.add( searchButton);
		leftHalf.add(searchComponentsCombine, BorderLayout.NORTH);
		// end of the code that makes the search bar
	
		// beginning of the code that makes the result panel
		JPanel resultPanel = new JPanel();
		resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));
		
		
		for (int i = 0; i < 25; i++) {	
			JButton stockButton= new JButton("Stock - " + i) {
				{
				 setSize(400, 200);
		         setMaximumSize(getSize());
				}
			};
			resultPanel.add(stockButton);
		}
		
		JScrollPane scrollPane = new JScrollPane(resultPanel);
		scrollPane.setPreferredSize(new Dimension(100, 370));
		
		leftHalf.add(scrollPane, BorderLayout.CENTER);
		// end of the code that makes the result panel
		
		// beginning of the code that makes the next/Prev buttons 
		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout());
		JButton previousButton = new JButton("Previous");
		JButton nextButton = new JButton("Next");
		bottom.add(previousButton);
		bottom.add(nextButton);
		leftHalf.add(bottom, BorderLayout.SOUTH);
		// End of that makes the next/Prev buttons 
		splitInHalves.add(leftHalf);
		// End of that makes the left
		
		//Begin of code that makes the right side/ half
		
		JPanel rightside = new JPanel();
	    rightside.setLayout(new BorderLayout());
	  
	    //Begin of code that makes the data Panel
	    JPanel datePanel = new JPanel();
		JButton dayButton = new JButton("Day");
		JButton weekButton = new JButton("Week");
		JButton monthButton = new JButton("Month");
		JButton yearButton = new JButton("Year");
	
		
	    datePanel.add(dayButton);
	    datePanel.add(weekButton);
	    datePanel.add(monthButton);
	    datePanel.add(yearButton);
	    
	    rightside.add(datePanel, BorderLayout.NORTH);
	    // End of that makes the data Panel
	    
	    //Begin of code that makes the Graphs
	    rightside.add(new JLabel ("Insert graph"), BorderLayout.CENTER);
	    // End of that makes the data Panel
	    
	    //Begin of code that makes the Graphs of buy sell buttons
	    rightside.add(new JLabel ("I forget what goes here."), BorderLayout.SOUTH);
	    // End of that makes the data Panel
	    
	    
	    splitInHalves.add(rightside);
	    // End of that makes the Right side/ half

		//this add the halves together
	    this.add(pageName, BorderLayout.NORTH);
		this.add(splitInHalves , BorderLayout.CENTER);
		
		

		
		
		
		searchButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		previousButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		nextButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		dayButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});	
		
		weekButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		monthButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});	
		
		yearButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});	

		
	 }
	}

// Split panel into borders, east and west
//split each border into three sections 
