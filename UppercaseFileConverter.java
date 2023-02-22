import java.io.*;

public class UppercaseFileConverter 
{
    public static void main(String[] args) 
    {
// Specify the input and output file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
// Open the input and output files
    try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) 
    {
// Read each line from the input file, convert to uppercase, and write to output file
            String line;
            while ((line = reader.readLine()) != null) 
            {
                writer.write(line.toUpperCase());
                writer.newLine();// Add a newline after each line
            }

// Output file written successfully
            System.out.println("File conversion successful!");

        } catch (IOException e) 
        {
// Handle any I/O errors that occur
            System.err.println("Error: " + e.getMessage());
        }
    }
}