;;; TOOL: wat2wasm
;;; ARGS: --enable-bulk-memory
(module
  (memory 0)

  (func
    i32.const 0
    i32.const 0
    i32.const 0
    table.copy)

  (table 0 anyfunc))