;;; TOOL: wat2wasm
(module
  (func
    block $foo
      i32.const 1
      br_if 0
    end))