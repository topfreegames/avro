package main

import (
	"bytes"
	"fmt"
	"time"

	avro "github.com/topfreegames/avro/eventsgateway/generated"
)

func main() {
	// Create a new Event struct
	event := avro.NewEvent()
	event.Id = "event-id"
	event.Name = "MyEvent"
	event.Props = map[string]string{
		"prop1": "val1",
		"prop2": "val2",
	}
	event.ClientTimestamp = time.Now().Unix()
	event.ServerTimestamp = time.Now().Unix()

	// Serialize the struct to a byte buffer
	var buf bytes.Buffer
	fmt.Printf("Serializing struct: %#v\n", event)
	err := event.Serialize(&buf)
	if err != nil {
		fmt.Printf("Error serializing struct: %v\n", err)
		return
	}

	// Deserialize the byte buffer back into a struct
	newEvent, err := avro.DeserializeEvent(&buf)
	if err != nil {
		fmt.Printf("Error deserializing struct: %v\n", err)
		return
	}
	fmt.Printf("Deserialized struct: %#v\n", newEvent)
}
