# Chapter 10: Exception

## try with resource

- Resources are closed after the `try` clause ends and before any `catch/finally` clauses.
- Resources are closed in the reverse order from which they were created.

try-with-resource only secure that the `close()` method will be call. If the `close()` method encounters an exception of its own or the method is implemented poorly, a resource leak can still occur.
