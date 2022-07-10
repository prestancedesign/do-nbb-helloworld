async function main(params) {
  const { handler } = await import('./hello.js');
  return handler(params);
}

exports.main = main;
