#dai.gomoku

This portion is the server portion of the gomoku project. The game logic is implemented in this portion.

##Getting The Server

There are a couple of ways of getting the game:

###Get and Compile the sources

If you have git installed in your system, then, you can clone this repository by running this command

	git clone https://github.com/DigitalAgeInstitute/dai.gomoku.git

This will get the sources and initialise a repository on your system that you could use to contribute back to the project in source

If you do not have git, [download the sources here](https://github.com/DigitalAgeInstitute/dai.gomoku) and click on the 'Download ZIP' button.
This downloads the sources for you that you can then compile and run.

####Dependencies

The server needs:

- gson library, which you can download [here](https://code.google.com/p/google-gson/downloads/list)
- JUnit library, which you can download [here](https://github.com/junit-team/junit/wiki/Download-and-Install). This will be needed if you wish to run the unit tests, and maybe create more of your own.
- JDBC MySQL library, which you can download [here](https://dev.mysql.com/downloads/connector/j/)

####Compiling and Running
If you have Eclipse on your system, you can simply import the project into your Eclipse workspace and run the dai.gomoku.server.GomokuDaemon class.

*NOTE:* You might need to create the database by running the *gomoku_db.sql* file in the *docs* directory

If you do not have Eclipse, make sure you have the libraries above in your class path then compile dai.gomoku.server.GomokuDaemon.java

i.e.

	javac dai.gomoku.server.GomokuDaemon.java

That should compile the entire server and you can run it with:

	java dai.gomoku.server.GomokuDaemon <port>

###Get the Jar File

Simply download the zip file from [here](https://github.com/DigitalAgeInstitute/dai.gomoku/tree/master/dist) and unzip it.

Use the gomoku_db.sql file to create the database. If you do not have access to the mysql server, ask your database admin to run the file to create the database.

Now, run the server:

	java -jar gomoku-server.jar <port>

All you need is to point your clients to the host where the server is running and enjoy a game, or two of Gomoku.

##Developer Notes

This section lists the various things that need to be done to improve on the server operation:

- Automate database installation
- Remove the gson dependency (reimplement the protocol to simple text - eliminate need for json)
