async function main(params) {
  const { handler } = await import('./hello.mjs');
  return handler(params);
}

exports.main = main;
