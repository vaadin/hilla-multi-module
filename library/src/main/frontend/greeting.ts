import {HelloWorldEndpoint} from "Frontend/generated/endpoints.js";

export async function getGreeting(name: string) {
  return await HelloWorldEndpoint.sayHello(name);
}
