import { loadFile } from 'nbb';

const { handler } = await loadFile('./hello.cljs');

export const main = handler;
