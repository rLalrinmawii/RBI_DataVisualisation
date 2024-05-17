# Data Visualization using RBI Dataset
Economic Analysis and Insights using Java




#### Introduction:

 The modern world is inundated with data, and harnessing its potential is crucial across various domains. In the realm of economics, data visualization plays a pivotal role in elucidating complex economic phenomena, facilitating insightful interpretation, and aiding informed decision-making. This project embarks on a journey into the intricate dynamics of the Indian economy, leveraging data visualization techniques to unravel the nuances of monetary dynamics encapsulated within the Reserve Bank of India's weekly reports.


#### Description of Dataset:

The dataset, spanning from July 6, 2001, to August 21, 2020, sourced from the Reserve Bank of India (RBI), offers a meticulous weekly overview of the components and sources shaping reserve money in the Indian economy, measured in rupees crore. It delves into critical aspects such as currency in circulation, representing tangible notes and coins circulating through economic channels. Additionally, it scrutinizes 'other' deposits with the RBI, encompassing a range of financial entities' deposits beyond traditional banking institutions, and bankers' deposits with the RBI, reflecting liquidity management within the monetary system.

At its core, the dataset focuses on reserve money, comprising currency in circulation, bankers' deposits, and 'other' deposits with the RBI. This aggregate serves as a foundational pillar for understanding broader monetary dynamics, offering insights into prevailing liquidity conditions over the analyzed period.

Moreover, the dataset provides granularity by delineating RBI's claims on the government and the commercial sector. This breakdown includes claims on the central government, banks, and commercial entities, distinguishing between claims on banks inclusive or exclusive of specialized institutions like NABARD. Such differentiation enhances analysis of the RBI's credit portfolio.

Furthermore, the dataset encapsulates the foreign exchange dimension, revealing the net foreign exchange assets held by the RBI. These assets play a crucial role in the central bank's ability to manage external financial obligations and stabilize currency markets. Additionally, it highlights the government's currency liabilities to the public, including currency issued by the government, and its impact on the broader monetary base.

Complementing monetary liabilities, the dataset captures the net non-monetary liabilities of the RBI, extending beyond traditional monetary transactions. This aspect enriches understanding of the RBI's balance sheet dynamics and implications for financial stability.

In summary, this dataset serves as a valuable resource for policymakers, economists, and researchers, facilitating a nuanced analysis of monetary dynamics within the Indian economy. By offering insights into reserve money components and sources, it enables a comprehensive understanding of monetary policy transmission mechanisms, liquidity dynamics, and financial stability considerations over the analyzed period. 


#### Statement of Problem: 

The Reserve Bank of India's weekly reports contain extensive data on reserve money components and sources in the Indian economy. However, navigating this data and extracting insights is challenging due to its volume and the limitations of traditional tabular formats. To overcome this obstacle, advanced data visualization techniques are necessary to transform the raw data into easily understandable formats. This project aims to utilize data visualization to unlock insights from the RBI's reports, enabling informed decision-making in economics.

#### Aim:

 This project aims to use data visualization methods to explore the Reserve Bank of India's weekly reports, revealing insights into the components shaping reserve money in the Indian economy. By creating visual representations from raw data, we seek to uncover hidden patterns and trends, providing stakeholders with actionable insights into monetary dynamics.


#### Objectives:

1.To generate visual representations, including bar charts, line charts, pie charts, and scatter plots, based on the data extracted from the Reserve Bank of India's weekly reports.
2.To analyze the trends and patterns revealed by the visualizations, shedding light on the fluctuations in currency circulation, bankers' deposits, reserve money components, and RBI's claims on various sectors.
3.To interpret the implications of the observed trends within the context of monetary policy, financial stability, and economic performance.
4.To provide stakeholders, including policymakers, economists, and researchers, with actionable insights derived from the visualized data, facilitating informed decision-making and strategic planning.



#### Exploratory Data Analysis (EDA) and Data Preprocessing:

As part of the initial stages of data exploration and preparation, Microsoft Excel was utilized for conducting the requisite tasks. During this process, missing values within the dataset were identified, particularly in the column representing "RBI's Claims on Central Govt." These missing values were denoted by hyphens in reports prior to December 6, 2002, while subsequent reports contained actual values. Recognizing that hyphens did not represent actual data but rather absence of information, they were replaced with the value "0" to accurately reflect the absence of claims. This adjustment ensured consistency in data representation and facilitated meaningful analysis and interpretation of the dataset.

#### Data Visualization:

For the data visualization aspect, a Java project named "DataVisualisation" was created using Maven as the build automation tool. Maven facilitated the project management by handling dependencies and project structure. Within the project, the JFreeChart library was utilized to generate various types of charts and graphs based on the provided dataset.

The structure of the Java project adhered to Maven conventions, comprising directories such as "src" for source code, "main" for main application files, "resources" for non-Java resources like CSV files, and "target" for compiled classes and packaged JAR files. Additionally, the "pom.xml" file served as the project object model, specifying project configurations, dependencies, and build instructions.

The functionalities of the project included:
1. Chart Generation: Utilizing the JFreeChart library to create different types of charts, including bar charts, line charts, pie charts, and scatter plots.
2. Data Loading: The dataset was loaded from a CSV file located in the "resources" directory of the project. The Java code utilized FileReader and BufferedReader to read the CSV file and parse the data for visualization.

Maven streamlined project management, while JFreeChart facilitated the creation of visual representations based on the dataset. The project structure followed Maven conventions, and the dataset loading process was implemented using standard Java file handling techniques.

The visualization of the dataset employs the following types of graphs:

Bar Chart: Bar charts represent categorical data using rectangular bars, where each bar corresponds to a category, and its length represents the value of the category. They are effective for comparing the sizes of different categories or tracking changes over time. Bar charts provide a clear visual depiction of data distribution, making them suitable for discrete datasets.

Line Chart: Line charts use lines to connect individual data points and are commonly used to illustrate trends or relationships between variables over time. They are particularly useful for displaying continuous data and identifying fluctuations or changes in data values. Line charts offer a visual representation of data distribution along a continuous scale, aiding in trend interpretation and prediction.

Pie Chart: Pie charts are circular graphics divided into slices to represent numerical proportions, with each slice indicating a proportion of the whole. The size of each slice is proportional to the quantity it represents, making pie charts effective for illustrating the composition of a total amount and highlighting relative sizes of different components. They are commonly used for visualizing percentages and proportions, providing a quick overview of categorical data.

Scatter Plot: Scatter plots display the relationship between two variables by plotting data points on a two-dimensional graph, with one variable on the x-axis and the other on the y-axis. They are valuable for identifying patterns, trends, and correlations between variables, especially for exploring relationships between continuous variables and detecting outliers or clusters within the data. Scatter plots offer a visual representation of data point distribution, aiding in uncovering underlying patterns and relationships in the dataset.

#### Interpretations of the Visualised Data:

##### Bar Chart:
The bar chart aims to visualize the components of reserve money over time, including currency in circulation, other deposits, and bankers' deposits.

It provides a visual comparison of how much money is allocated to various categories, such as currency in circulation, deposits, and other financial instruments, allowing for easy identification of changes or trends in the distribution pattern.
<img width="798" alt="barChart" src="https://github.com/rLalrinmawii/RBI_DataVisualisation/assets/142977438/011d9395-3e3c-4bef-9ba1-2ce775ea9c9a">



Interpretation: The grpah provides a visual comparison allowing for easy identification of changes or trends in the distribution pattern. The report dates in the graph start from the most recent and end with the oldest report. By examining the bar chart, one can observe the fluctuations in each component of reserve money over the reporting period. Significant trends or changes in the relative proportions of these components can be identified, providing insights into monetary dynamics. Over the years, currency in circulation increased significantly. 'Other' deposits also grew, peaking in mid-2020. Bankers' deposits with the RBI increased gradually until 2016 and then slightly declined in the most recent report.


##### Line Chart:
The line chart aims to depict the trend of reserve money over time.

By plotting data points and connecting them with lines, it depicts the trajectory of the total money supply, indicating whether it is increasing, decreasing, or remaining stable over the reporting period.
<img width="800" alt="LineGRAPH" src="https://github.com/rLalrinmawii/RBI_DataVisualisation/assets/142977438/4d231c9c-9378-437c-a56f-e395b258282c">



Interpretation: Analysis of the line chart allows for the identification of trends in the overall reserve money over the reporting period. Any consistent upward or downward trends can indicate changes in monetary policy or economic conditions, offering valuable insights for decision-making. Since the report dates in the graph start from the most recent and end with the oldest report, it suggests economic growth and increased liquidity in the financial system. The peak in recent years indicates a period of substantial monetary expansion. However, the noticeable decline at the end of 2016 until 2017 could point to temporary tightening of monetary policy or economic adjustment. This fluctuation, followed by continued growth after the decline, provides valuable insights into the changing economic conditions and policy responses over time.



##### Pie Chart:
The pie chart aims to illustrate the composition of RBI's claims, including claims on the government, banks, and commercial sectors.

It represents the distribution of funds among various sectors in a circular format, with each sector's share depicted as a slice of the pie. This allows for a clear understanding of the relative size and importance of each sector in the financial landscape.
<img width="800" alt="pieChart" src="https://github.com/rLalrinmawii/RBI_DataVisualisation/assets/142977438/73509ad4-0ec5-4da5-beda-17a42436b903">


Interpretation: Examination of the pie chart allows for understanding the distribution of the RBI's claims across different sectors. By comparing the sizes of each slice, one can assess the relative importance of each sector in terms of the RBI's claims, providing insights into the central bank's role in the economy.

In the chart, more than 80% of the claims are on the government, represented in red. The blue area shows the RBI's claims on banks and the commercial sector. The RBI's claims on the central government are minimal and do not appear on the graph. This is likely because there were no reports on the RBI's claims on the central government until 2002, and the claims in this category have generally been low.



##### Scatter Plot:
The scatter plot aims to explore the relationship between currency in circulation and bankers' deposits.

By plotting individual data points on a graph with one variable on the x-axis and the other on the y-axis, it helps identify any patterns, trends, or correlations between the two variables, providing insights into their interdependence or association.
<img width="796" alt="scatterplot" src="https://github.com/rLalrinmawii/RBI_DataVisualisation/assets/142977438/775a7238-65e1-4e8c-9292-bac9e2cb8473">


Interpretation: Analysis of the scatter plot allows for identifying correlations or patterns between currency in circulation and bankers' deposits. Clusters or outliers in the data points can reveal specific trends or anomalies in the relationship between these variables, providing insights into monetary behavior or market dynamics.

In the scatter plot, the data points form clusters that gradually shift higher over time. This indicates a positive correlation where increases in currency circulation are accompanied by increases in bankers' deposits, suggesting a growing economy and changes in the monetary environment. This upward movement of clusters highlights the dynamic relationship between these variables, reflecting broader economic trends.


#### Conclusion:

The analysis of various charts provides a comprehensive view of the economic trends and monetary policies over the reporting period. The bar chart illustrates the significant growth in currency circulation, other deposits, and bankers' deposits with the RBI, indicating an overall expansion in monetary components. This growth reflects increased economic activity and liquidity in the financial system. The line chart's upward trend, with a peak in recent years, further emphasizes this monetary expansion, signifying robust economic growth and proactive monetary policies. However, the temporary decline in 2016-2017 suggests episodes of monetary tightening or economic adjustments, highlighting the dynamic nature of economic management.

The pie chart's distribution, with a predominant share of RBI's claims on the government, underscores the central bank's significant role in financing government operations. The scatter plot reveals a positive correlation between currency circulation and bankers' deposits, indicating a growing economy and changes in the monetary environment. Overall, these visualizations provide valuable insights into the economic conditions, monetary policy adjustments, and the central bank's influence, reflecting a period of substantial economic growth and evolving financial dynamics.




