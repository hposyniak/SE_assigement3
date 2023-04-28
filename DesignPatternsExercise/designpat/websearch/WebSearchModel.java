package designpat.websearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a file), notify the interested observers of each
 * query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();
    private final List<PolicyObject> filters = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        // Source:
        // https://stackoverflow.com/questions/5868369/how-can-i-read-a-large-text-file-line-by-line-using-java
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, PolicyObject queryFilter) {
        observers.add(queryObserver);
        filters.add(queryFilter);

    }

    private void notifyAllObservers(String line) {
        for (int i = 0; i < observers.size(); i++) {
            if(filters.get(i).accept(line)){
                observers.get(i).onQuery(line);
            }
            
        }
    }
}
