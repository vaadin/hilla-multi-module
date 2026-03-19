import {Button, TextField} from "@vaadin/react-components";
import { useSignal } from "@vaadin/hilla-react-signals";
import {HelloWorldEndpoint} from "Frontend/generated/endpoints.js";
import {Notification} from "@vaadin/notification";
import handleError from "Frontend/views/_ErrorHandler.js";

async function sayHello(name: string) {
  try {

    const serverResponse = await HelloWorldEndpoint.sayHello(name);
    Notification.show(serverResponse);
  } catch (error: unknown) {
    handleError(error);
  }
}

export default function HelloWorldView() {
  const name = useSignal("");

  return <div className="flex p-m gap-m items-end">
    <TextField
      label="Your name"
      value={name.value}
      onChange={(e) => name.value = e.target.value}
    />
    <Button
      onClick={() => sayHello(name.value)}
    >
      Say hello
    </Button>
  </div>;
}