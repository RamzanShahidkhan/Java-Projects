package com.lynda.javatraining;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		try(WatchService service=FileSystems.getDefault().newWatchService())
		{
			Map<WatchKey, Path> keyMap=new HashMap<>();
			Path path=Paths.get("files");
			keyMap.put(path.register(service,
					StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY)
					, path);
			WatchKey watchkey;
			do {
				watchkey=service.take();
				Path eventDir=keyMap.get(watchkey);
				
				for (WatchEvent<?> event : watchkey.pollEvents()) {
					WatchEvent.Kind<?> kind=event.kind();
					Path eventPath=(Path)event.context();
					System.out.println(eventDir+" : " +kind+": " +eventPath);
					
					
				}
			} while (watchkey.reset());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}