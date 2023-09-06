package boardgame;

	public abstract class Piece {
		
		protected Position position;
		private Board board;
		
		public Piece(Board board) {
			this.board = board;
			position = null;
		}

		protected Board getBoard() {
			return board;
		}
		
		public abstract boolean [][] possibleMovie();
		
		public boolean possibleMovie(Position position) {
			return possibleMovie()[position.getRow()][position.getColumn()];
		}
		
		public boolean isThereAnyPossibleMove(){
			boolean[][] mat = possibleMovie();
			for (int i=0; i<mat.length; i++){
				for(int j=0; j<mat.length; j++){
					if (mat[i][j]){
						return true;
					}
				}
			}
			return false;
		}
}
