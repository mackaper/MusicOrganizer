import java.util.ArrayList;


public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    public void checkIndex(int value) //exersie 4.14
    {
        if(value < 0 || value > files.size() - 1)
        {
            System.out.println("ERROR, The value not in the range, the value must be higher than zero and lower than " + files.size()-1);
        }
    }
    public boolean validIndex(int value) //exersie 4.15
    {
      boolean valid;
      if(value < 0 || value > files.size() - 1)
      {
          valid = false;
      }
      else
      {
          valid =  true;
      }
      return valid;
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)// Exersie 4.16
    {
        if(validIndex(index) == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) // Exersie 4.16
    {
        if(validIndex(index) == true) {
            files.remove(index);
        }
    }
}
